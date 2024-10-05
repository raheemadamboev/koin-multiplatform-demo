package xyz.teamgravity.koinmultiplatformdemo.data.repository

import xyz.teamgravity.koinmultiplatformdemo.data.local.MyDatabase

class RepositoryImp(
    private val database: MyDatabase
) : Repository {

    override fun getText(): String {
        return database.getText()
    }
}